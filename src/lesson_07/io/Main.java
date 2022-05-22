package lesson_07.io;

import java.io.*;

//InputStream: чтение - read
//OutputStream: запись - write

public class Main {
    public static void main(String[] args) {
        //doByteArrayStream();
        doDataStream();
    }

    // Работа с файлами
    public static void doDataStream(){
        File file = new File("src/lesson_07/io/file.txt");
        doDataOutputStream(file, "Hello"); // write
        doDataInputStream(file); // read
    }

    static void doDataInputStream(File file){
        try(DataInputStream dis = new DataInputStream(new FileInputStream(file));){
            System.out.println(dis.readUTF());
            System.out.println(dis.readInt());
            System.out.println(dis.readBoolean());
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    static void doDataOutputStream(File file, String value){
        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(file))){
            dos.writeUTF(value);
            dos.writeInt(228);
            dos.writeBoolean(true);
        }catch (IOException e){
            e.printStackTrace();
        }
    }


    // Работа с потоками байтов
    public static void doByteArrayStream(){
        byte[] bytes = doByteArrayOutputStream("Hello world");
        doByteArrayInputStream(bytes);
    }

    static void doByteArrayInputStream(byte[] bytes){
        try(ByteArrayInputStream bais = new ByteArrayInputStream(bytes)){
            int b;
            while((b = bais.read()) != -1){
                System.out.print((char) b + " ");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    static byte[] doByteArrayOutputStream(String value){
        try(ByteArrayOutputStream baos = new ByteArrayOutputStream()){
            baos.write(value.getBytes());
            return baos.toByteArray();
        }catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }
}
