public class BmiService {
    public double calculate (int bodyWeight, double humanHeight){
        double bodyMassIndex = bodyWeight/(humanHeight*humanHeight);
        return (bodyMassIndex);
    }
}
