package service.app.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;



public class Tools {
	
	
	public static String readAsString(InputStream is) throws IOException{
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		try {
            byte[] buffer = new byte[1024];
            for (int n; (n = is.read(buffer)) > 0;) {
                out.write(buffer, 0, n);
            }
            
        }finally {
        	out.flush();
            out.close();
		}
		return out.toString();
	}
}
