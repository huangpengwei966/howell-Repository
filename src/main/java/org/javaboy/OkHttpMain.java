package org.javaboy;
import okhttp3.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class OkHttpMain {
    public static void main(String[] args) {
        //OkHttpClient okHttpClient = new OkHttpClient.Builder().build();
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        OkHttpClient okHttpClient = ctx.getBean("okHttpClient", OkHttpClient.class);
        Request request = new Request.Builder()
                .get()
                .url("http://b.hiphotos.baidu.com/image/h%3D300/sign=ad628627aacc7cd9e52d32d909032104/32fa828ba61ea8d3fcd2e9ce9e0a304e241f5803.jpg")
                .build();
        Call call = okHttpClient.newCall(request);
        call.enqueue(new Callback() {

            public void onFailure(Call call, IOException e) {
                System.out.println(e.getMessage());
            }


            public void onResponse( Call call, Response response) throws IOException {
                FileOutputStream out = new FileOutputStream(new File("E:\\123.jpg"));
                int len;
                byte[] buf = new byte[1024];
                InputStream is = response.body().byteStream();
                while ((len = is.read(buf)) != -1) {
                    out.write(buf, 0, len);
                }
                out.close();
                is.close();
            }
        });
    }
}
