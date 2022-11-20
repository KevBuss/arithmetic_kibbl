package Problem81;

public class DataRow
{
    double y;
    double[] x;

    /**
     * populates the x and y values to represent a row of data in DataSet
     */
    public DataRow(double yvalue, double[] xvalues)
    {
        y = yvalue;
        x = new double[xvalues.length];
        for(int i = 0; i < xvalues.length; i++) {
            x[i] = xvalues[i];
        }
    }
}
