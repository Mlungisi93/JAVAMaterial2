public class FirstMethod {



        private static int firstMethodInstanceVariable = 3;

        public static void main(String[] args) {

            System.out.println("Eduards first accessor method variable value = "+getFirstMethodInstanceVariable());
        }

        /**
         * Check out the different parts of a method
         */
        public static int getFirstMethodInstanceVariable()
        {
            return firstMethodInstanceVariable;
        }



}
