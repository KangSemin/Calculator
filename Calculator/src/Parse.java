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

    public Number double2Int(double d)
    {
        return d%1==0?Integer.valueOf((int)d):d;
    }

}
