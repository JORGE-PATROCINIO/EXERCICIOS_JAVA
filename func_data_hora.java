package app;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class Programa {
 // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/text/SimpleDateFormat.html
	public static void main(String[] args) {
		 /*instânciando uma data e horário*/
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDate d01 = LocalDate.now(); 			// variável d01 retorna a data local
		LocalDateTime d02 = LocalDateTime.now(); 	// variável d02 retorna horário e data local
		Instant d03 = Instant.now(); 				// variável d03 retorna a data e horário global(fuso horário)
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z"); 
		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00"); // retornar o valor tempo local para o fuso de londres!
		
		LocalDate d08 = LocalDate.parse("22/07/2023",fmt1); // converte o texto para data
		LocalDateTime d09 = LocalDateTime.parse("22/07/2023 01:30",fmt2); // converte o texto para data e hora!
		
		LocalDate d10 = LocalDate.of(2022, 7, 20); // instancia uma data
		LocalDateTime d11 = LocalDateTime.of(2023,7,20,1,30 ); // instancia uma data e hora

		System.out.println(d01);
		System.out.println(d02);
		System.out.println(d03);
		System.out.println(d04);
		System.out.println(d05);
		System.out.println(d06);
		System.out.println(d07);
		System.out.println(d08);
		System.out.println(d09);
		System.out.println(d10);
		System.out.println(d11);

		// formatar data e hora fora do padrão iso 8601 reconhecido como padrão pelo java, para um formato customizado!
		
		System.out.println(d04.format(fmt1));
		System.out.println(fmt1.format(d04));
		System.out.println(d05.format(fmt2));
		
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		// withZone ele pega o fuso horário do sistema local
		
		System.out.println(fmt3.format(d06));
		
		//##############################################################################################################
		
		LocalDate date04 = LocalDate.parse("2022-07-20");
		LocalDateTime date05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant date06 = Instant.parse("2022-07-20T01:30:26Z"); // horário global pré definido
		
		LocalDate r1 = LocalDate.ofInstant(date06, ZoneId.systemDefault()); 
		LocalDate r2 = LocalDate.ofInstant(date06, ZoneId.of("Portugal")); 
		LocalDateTime r3 = LocalDateTime.ofInstant(date06, ZoneId.systemDefault()); 
		LocalDateTime r4 = LocalDateTime.ofInstant(date06, ZoneId.of("Portugal")); 
		
		System.out.println("retornar a data do sistema local com base no sistema global " + r1);
		System.out.println("retornar a data de qualquer região(parametro) com base no sistema global! " + r2);
		System.out.println("retornar a data e o horário do sistema local com base no sistema global " + r3);
		System.out.println("retornar a data e  o horário de qualquer região(parametro) com base no sistema global! "+r4);
		
		System.out.println("\ndate04(retornando o dia da variável) " + date04.getDayOfMonth());
		System.out.println("date04(retornando o mês da variável) " + date04.getMonthValue());
		System.out.println("date04(retornando o ano da variável) " + date04.getYear());
		
		System.out.println("date05(retornando a hora da variável) " + date05.getHour());
		System.out.println("date05(retornando o minuto da variável) " + date05.getMinute());

// ######################## Cáuculos de data e hora ###################################################################
		
		LocalDate semanaAnterior = date04.minusDays(7);
		LocalDate semanaPosterior = date04.plusDays(7);
		
		System.out.println("\nsubtrai 7 dias da variavel date04 " + date04 + " => " + semanaAnterior);
		System.out.println("Add 7 dias da variavel date04 " + date04 + " => " + semanaPosterior);
		
		LocalDateTime semanaAnteriorDataHora = date05.minusDays(7);
		LocalDateTime semanaPosteriorDataHora = date05.plusDays(7);
		
		System.out.println("\nsubtrai 7 dias da variavel date05 " + date05+ " => " + semanaAnteriorDataHora);
		System.out.println("Add 7 dias da variavel date05 " + date05 + " => " + semanaPosteriorDataHora);
		
		Instant semanaAnteriorInstant = date06.minus(7,ChronoUnit.DAYS);
		Instant semanaPosteriorInstant = date06.plus(7,ChronoUnit.DAYS);
		
		System.out.println("\nsubtrai 7 dias da variavel date06 " + date06 + " => " + semanaAnteriorInstant);
		System.out.println("Add 7 dias da variavel date06 " + date06 + " => " + semanaPosteriorInstant);
		
		Duration t1 = Duration.between(semanaAnteriorDataHora, date05);
		
		System.out.println("\nt1 = tempo entre semanaAnteriorDataHora e date05 => " + t1.toDays());
		
		Duration t2 = Duration.between(semanaAnterior.atStartOfDay(), date04.atStartOfDay()); // não aceita hora
		
		System.out.println("\nt2 = tempo entre semanaAnterior e date04(atStartOfDay) => " + t2.toDays());
		
		Duration t3 = Duration.between(semanaAnteriorInstant, date06);
		Duration t4 = Duration.between(date06, semanaAnteriorInstant);
		System.out.println("\nt3 = tempo entre semanaAnteriorInstant e date06 => " + t3.toDays());
		System.out.println("\nt4 = tempo entre date06 e semanaAnteriorInstant => " + t4.toDays());
		
	}

}

