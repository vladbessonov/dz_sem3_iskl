import Exceptions.ArrayCountElementException;
import Exceptions.EmptyStringException;
import Exceptions.IncorrectValueException;
import java.io.IOException;
import java.util.Scanner;

public class Human {
     public static void getData() throws EmptyStringException, ArrayCountElementException, IncorrectValueException, IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные в порядке указанном ниже:\n" +
                " <Фамилия> <Имя> <Отчество> <Дата рождения> <Телефон> <Пол>\n " +
                "Примечание. Пол вводится латиницей m - мужской, f - женский.\n" +
                "Пример:\n" +
                "Иванова Татьяна Ивановна 01.01.2000 9175789123 f");
        String inputData;
        inputData = scanner.nextLine();
        if (inputData.isEmpty()){
            throw new EmptyStringException("Строка является пустой");
        }

        inputData = inputData.replaceAll("\\s+", " ");
        inputData = inputData.trim();
        String[] bufferArray = inputData.split(" ");
        if (bufferArray.length == 6){
            Check.checkDateFormat(bufferArray[3]);
            Check.checkPhoneNumberFormat(bufferArray[4]);
            Check.checkGenderFormat(bufferArray[5]);
            FileWrite.createFile(bufferArray);
        }
        else {
            throw new ArrayCountElementException("Вы ввели не все данные или\n" +
                    "пропустили пробел");
        }
    }
}
