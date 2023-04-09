package br.com.erudio.functions;

public class IsNumeric {

    private String strnumber;
    private String numeber;


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

    public boolean isNumeric(String strnumber){

        setStrnumber(strnumber);

        if(getStrnumber() == null) return false;
        setNumeber( strnumber.replaceAll(",","."));
        return getNumeber().matches("[-+]?[0-9]*\\.?[0-9]+");


    }

}
