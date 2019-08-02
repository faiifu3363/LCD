public class LcdNumber {


    public void convertToLcd(String num) {
//        char[][][] arrayChar = new char[3][3][3];
//        Character myChar = null;
//
//        for (int i = 0; i < num.length(); i++) {
//            char c = num.charAt(i);
//            if (num.equals("1")) {
//                arrayChar = new char[][][]{
//                        {{myChar, myChar, myChar},
//                                {myChar, '|', myChar},
//                                {myChar, '|', myChar}}
//
//                };
//            }
//        }
       String[][][] arrayString = new String[3][3][3];
        if (num.equals("1")) {
            arrayString = new String[][][]{
                            {{"", "", ""},
                            {"", "|", ""},
                            {"", "|", ""}}

            };
        }


        for (int row = 0; row < arrayString.length; row++) {
            for (int col = 0; col < arrayString[row].length; col++) {
                for (int col2 = 0; col2 <  arrayString[row][col].length; col2++) {
                    System.out.print(arrayString[row][col][col2]);
                }
            }

        }
    }
}
