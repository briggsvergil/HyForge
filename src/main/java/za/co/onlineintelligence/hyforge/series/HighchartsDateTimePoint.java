package za.co.onlineintelligence.hyforge.series;

import za.co.onlineintelligence.hyforge.common.Exportable;
import za.co.onlineintelligence.hyforge.common.annotations.DelegateDeflate;

import java.lang.reflect.Field;
import java.time.ZonedDateTime;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;

/**
 * Class to create an X or Y point as a datetime object.
 *
 * @author Sean Briggs
 */
public class HighchartsDateTimePoint implements Exportable {
    public HighchartsDateTimePoint() {

    }

    public HighchartsDateTimePoint(ZonedDateTime dateTime) {
        this.dateTime = dateTime;
    }

    @DelegateDeflate
    private ZonedDateTime dateTime;

    public ZonedDateTime getDateTime() {
        return this.dateTime = getInstanceOf(ZonedDateTime.class, this.dateTime);
    }

    public void setDateTime(ZonedDateTime dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public Object getDelegatedValue(Field field) {
        if(field.getName().equalsIgnoreCase("dateTime")) {
            return dateTime!= null? "" + dateTime.toInstant().toEpochMilli() : null;
        }
        return null;
    }

    /*@Override
    public String deflateField(Field field, int tabLevel) {
        String s = Exportable.super.delegateFieldDeflation(field, "dateTime", dateTime == null,
                () -> dateTime.toInstant().toEpochMilli() + "");
        return s != null && s.equals(RTS) ? Exportable.super.deflateField(field, tabLevel) : s;
    }*/
}
