public class DataRow
{
    double y;
    double[] x;
    public DataRow(double yvalue, double[] xvalues)
    {
        y = yvalue;
        x = new double[xvalues.length];
        for(int i = 0; i < xvalues.length; i++) {
            x[i] = xvalues[i];
        }
    }
}
