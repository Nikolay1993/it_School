import java.util.Random;
import java.util.Scanner;

/**
 * Created by Николай on 14.07.2016.
 */
public class zadaniya2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int e = sc.nextInt();

        String[] a = {"Дорогие друзья!",

                "с другой стороны",

                "равным образом",

                "Не следует, однако, забывать о том, что",

                "Таким образом,",

                "Повседневная практика показывает, что",

                "Значимость этих проблем настолько очевидна, что",

                "Разнообразный и богатый опыт",

                "Задача организации, в особенности же",

                "Соображения высшего порядка, а также" };
        String[] b = {"реализация намеченных плановых заданий",

                "рамки и место обучения кадров",

                "постоянный количественный рост и сфера нашей активности сложившаяся структура организации",

                "новая модель",

                "организационной деятельности",

                "дальнейшее развитие различных форм деятельности",

                "постоянное информационно-пропагандистское обеспечение нашей деятельности",

                "укрепления и развития структуры",

                "консультация с широким активом",

                "начало повседневной работы по формированию позиции" };
        String[] c = {"играет важную роль в формировании",

                "требуют от нас анализа",

                "требуют определения и уточнения",

                "способствует подготовке и реализации",

                "обеспечивает широкому кругу специалистов участие в формировании",

                "позволяет выполнить",

                "важнейшие задания по разработке",

                "в значительной степени обуславливает создание",

                "позволяет оценить значение",

                "представляет собой интересный эксперимент проверки",

                "влечет за собой процесс внедрения и модернизации" };
        String[] d = {"существующих финансовых и административных условий",

                "дальнейших направлений развитая",

                "системы массового участия",

                "позиций, занимаемых участниками в отношении поставленных задач",

                "новых предложений",

                "направлений прогрессивного развития",

                "системы обучения кадров соответствующей насущным потребностям",

                "соответствующих условий активизации",

                "модели развития",

                "форм воздействия" };
        String p = "";
        Random o = new Random();
        for(int i = 0; i < e; i++){
            p+=a[o.nextInt(10)];
            p+=b[o.nextInt(10)];
            p+=c[o.nextInt(10)];
            p+=d[o.nextInt(10)];
        System.out.println(p);
            p="";
        }
    }
}