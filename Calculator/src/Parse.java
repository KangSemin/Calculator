public class Parse {

    public Number parse(String s) {

        try {
            // 정수형으로 변환 시도
            return Integer.parseInt(s);

        } catch (NumberFormatException e1) {
            try {
                // 실수형으로 변환 시도
                return Double.parseDouble(s);

            } catch (NumberFormatException e2) {
                throw new NumberFormatException("Please input number!");
            }
        }
    }

    public Number parse(Number d)
    {

        d=Math.round(d.doubleValue()*1000000.0)/1000000.0;

        try
        {
            return ( d.doubleValue()%1==0 ? (Number) d.intValue() : (Number) d.doubleValue()) ;
        }
        catch(NumberFormatException e)
        {
            throw new NumberFormatException("Please input number!");
        }

    }

}
