/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package utilities;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 *
 * @author root
 */
public class Format {
    public final static SimpleDateFormat dateFmtShow = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    public final static SimpleDateFormat dateFmtSql = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
    public final static SimpleDateFormat timeFmt = new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH);
    public final static DecimalFormat doubleFmt = new DecimalFormat("##,###,##0.00");
    public final static DecimalFormat qtyFmt = new DecimalFormat("##,###,##0.000");
    public final static DecimalFormat integerFmt = new DecimalFormat("##,###,##0");
    public final static DecimalFormat double3Fmt = new DecimalFormat("##,###,##0.000");
}
