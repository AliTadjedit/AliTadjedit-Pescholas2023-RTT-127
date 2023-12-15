



    public class EncapsulationExample {

        public static void main(String[]args){


            // HumanBeing humanBeing=new HumanBeing(160.5f,5.12f,23);
            HumanBeing humanBeing=new HumanBeing();


            humanBeing.setHeight(1.83f);
            humanBeing.setWeight(89.3f);
            humanBeing.setBmi(calculateBmi(humanBeing));

            System.out.println("Person has "+humanBeing.getWeight()+" kgs and is "+humanBeing.getHeight()+" meters in height, which results in BMI of "+humanBeing.getBmi());
        }





        public static float calculateBmi(HumanBeing humanBeing){
            return humanBeing.getWeight()/(humanBeing.getHeight()*humanBeing.getHeight());
        }


    }

