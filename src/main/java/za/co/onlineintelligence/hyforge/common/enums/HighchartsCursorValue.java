package za.co.onlineintelligence.hyforge.common.enums;

/**
 * @author Sean
 */
public enum HighchartsCursorValue {

    ALIAS, ALL_SCROLL, AUTO, CELL, COL_RESIZE, CONTEXT_MENU, COPY, CROSSHAIR,
    DEFAULT, E_RESIZE, EW_RESIZE, GRAB, GRABBING, HELP, MOVE, N_RESIZE,
    NE_RESIZE, NESW_RESIZE, NO_DROP, NONE, NOT_ALLOWED, NS_RESIZE, NW_RESIZE,
    NWSE_RESIZE, POINTER, PROGRESS, ROW_RESIZE, S_RESIZE, SE_RESIZE, SW_RESIZE,
    TEXT, VERTICAL_TEXT, W_RESIZE, WAIT, ZOOM_IN, ZOOM_OUT;

    @Override
    public String toString() {
        return this.name().toLowerCase().replace("_", "-");
    }
}
