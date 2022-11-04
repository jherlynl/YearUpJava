public class typeCasting
{
        public static void main(String[] args)
        {
            Double object = new Double(args[0]);
            int a = object.intValue();
            byte b = object.byteValue();
            float d = object.floatValue();
            double c = object.doubleValue();

                System.out.println("int:" + a + "byte:" + b + "double:" + c + "float:" + d );
        }
}

