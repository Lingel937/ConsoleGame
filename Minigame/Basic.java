import java.util.Random;
public class Basic {
   public static Random rand = new Random();
    public static int generateRarity(){
        int m_nParameterOne = rand.nextInt(10);
        int m_nParameterTwo = rand.nextInt(10);
        int m_nParameterThree = rand.nextInt(10);
        int m_nParameterFour = rand.nextInt(10);
        int m_nParameterFive = rand.nextInt(10);
        int m_nParameterSix = rand.nextInt(10);
        int m_nParameterSeven = rand.nextInt(10);
        int m_nParameterEight = rand.nextInt(10);
        int m_nParameterNine = rand.nextInt(10);
        int m_nParameterTen = rand.nextInt(10);
        int m_nFinalParameter = m_nParameterOne + m_nParameterTwo + m_nParameterThree + m_nParameterFour + m_nParameterFive + m_nParameterSix + m_nParameterSeven + m_nParameterEight + m_nParameterNine + m_nParameterTen;
        //System.out.println(m_nFinalParameter);
        if(m_nFinalParameter > 35 && m_nFinalParameter < 65){
            //common
            //System.out.println("Common Enemy spawned");
            return 1;
        }else if (( m_nFinalParameter < 35 && m_nFinalParameter > 25)  || (m_nFinalParameter > 65 && m_nFinalParameter < 75)) {
            //rare
            //System.out.println("rare enemy spawned");
            return 2;
        }else if ((m_nFinalParameter < 25 && m_nFinalParameter > 15) || (m_nFinalParameter > 75 && m_nFinalParameter < 85)) {
            //epic
            return 3;
        }
        else{
            return 1;
        }
    }
    public static boolean yesNo3070(){
        if( rand.nextInt(3)== 2){
            return true;
        }
        return false;
    }
}
