package HashcodeEquals;

import java.util.Objects;

public class LuxuryAuto {
    private String model;
    private int manufactureYear;
    private int dollarPrice;

    public LuxuryAuto(String model, int manufactureYear, int dollarPrice) {
        this.model = model;
        this.manufactureYear = manufactureYear;
        this.dollarPrice = dollarPrice;
    }
    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;

        LuxuryAuto that = (LuxuryAuto) obj;

        if(manufactureYear != that.manufactureYear) return false;
        if(dollarPrice != that.dollarPrice) return false;
        return Objects.equals(model, that.model);    }

    @Override
    public int hashCode() {
        int result = model != null ? model.hashCode() : 0;
        result = 31 * result + manufactureYear;
        result = 31 * result + dollarPrice;
        return result;
    }
}