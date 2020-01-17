package za.co.onlineintelligence.hyforge.series;

import za.co.onlineintelligence.hyforge.common.DrosteDeflater;

import java.lang.reflect.Field;
import java.time.ZonedDateTime;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;

/**
 * Class to create an X or Y point as a datetime object.
 *
 * @author Sean Briggs
 */
public class HighchartsDateTimePoint implements DrosteDeflater {
    public HighchartsDateTimePoint() {

    }

    public HighchartsDateTimePoint(ZonedDateTime dateTime) {
        this.dateTime = dateTime;
    }

    private ZonedDateTime dateTime;

    public ZonedDateTime getDateTime() {
        return this.dateTime = getInstanceOf(ZonedDateTime.class, this.dateTime);
    }

    public void setDateTime(ZonedDateTime dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String deflateField(Field field, int tabLevel) {
        String s = DrosteDeflater.super.delegateFieldDeflation(field, "dateTime", dateTime == null,
                () -> dateTime.toInstant().toEpochMilli() + "");
        return s != null && s.equals(RTS) ? DrosteDeflater.super.deflateField(field, tabLevel) : s;
    }
}
