package in.nareshit.raghu;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MessageRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
     System.out.println("WELCOME TO SPRING BOOT APP");		
     System.out.println("HELLO MODIFIED");	

	}

}
