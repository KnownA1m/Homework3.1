public class BmiService {
    public int calculate ( int index ) {
        int height = (int) 200; // рост в сантиметрах
        int height2 = height / 100; // в метрах
        int IMT = index / (height2 * height2);
        return IMT;
    }
}
