package com.example.demo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileWriter;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.concurrent.ThreadLocalRandom;

@RestController
public class controller {

    @GetMapping()
    public Output test() {
        Output output = new Output();
        try(final DatagramSocket socket = new DatagramSocket()){
            socket.connect(InetAddress.getByName("8.8.8.8"), 10002);
            String ip = socket.getLocalAddress().getHostAddress();
            output.setIp(ip);
        }
        catch(Exception e){
            output.setIp("cant get ip");
        }
        output.setText("write to file");
        output.setRandom(ThreadLocalRandom.current().nextInt(0, 1000));

        try(final FileWriter fileWriter = new FileWriter("/bcabit/kub/test/samplefile2.txt")){
            fileWriter.write(output.getText());
        }
        catch (Exception e){
            output.setText("cant write to file");
        }


        return output;
    }

    @Getter
    @Setter
    class Output {
        String text;
        String ip;
        Integer random;
    }


}
