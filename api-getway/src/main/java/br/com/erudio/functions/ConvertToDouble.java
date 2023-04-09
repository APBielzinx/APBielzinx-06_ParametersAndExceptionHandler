package br.com.erudio.functions;

public class ConvertToDouble {

    private String strnumber;
    private String numeber;

    IsNumeric isNumeric = new IsNumeric();

    public String getStrnumber() {
        return strnumber;
    }

    public void setStrnumber(String strnumber) {
        this.strnumber = strnumber;
    }

    public String getNumeber() {
        return numeber;
    }

    public void setNumeber(String numeber) {
        this.numeber = numeber;
    }

    public Double convertToDouble(String strgnumber) {

        setStrnumber(strgnumber);


        if(strgnumber == null) return 0D;
        setNumeber( strgnumber.replaceAll(",","."));
        if (isNumeric.isNumeric(getNumeber())) return Double.parseDouble(getNumeber());
        return 0D;
    }
}
