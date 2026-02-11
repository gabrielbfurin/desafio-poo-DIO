import java.time.LocalDate;

import br.com.dio.desafio.dominio.curso;
import br.com.dio.desafio.dominio.mentoria;

public class main {
    public static void main(String[] args) {

        curso curso1 = new curso();
        curso1.setTitulo(" Curso Java");
        curso1.setDescricao(" Descrição do curso Java");
        curso1.setCargaHoraria( 8);
        curso curso2 = new curso();
        curso2.setTitulo(" Curso JS");
        curso2.setDescricao(" Descrição do curso JS");
        curso2.setCargaHoraria(  4);

        System.out.println(curso1);
        System.out.println(curso2);

        mentoria mentoria1 = new mentoria();
        mentoria1.setTitulo(" mentoria de Java");
        mentoria1.setDescricao(" descrição mentoria Java");
        mentoria1.setData(LocalDate.now());

        System.out.println(mentoria1);
    }
}
