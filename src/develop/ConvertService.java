package develop;

import utils.Rounder;
public class ConvertService {
    public String convKmhToMph(double num1) {
        return roundRes(kmh(num1));
    }

    double kmh(double num1) {
        return num1 * 0.62137119609836;
    }

    String roundRes(double res) {
        return Rounder.roundValue(res);
    }
}