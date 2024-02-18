import Exceptions.IncorrectValueException;

public class Check {
   
public static void checkDateFormat(String date) throws IncorrectValueException {

    char[] checkData = date.toCharArray();
    if (checkData.length == 10 && (checkData[2] == '.' && checkData[5] == '.')){

    } else {
        throw new IncorrectValueException("Формат даты введен не правильно. Правильный формат ввода данных dd.mm.yyyy");
    }
}

    
    public static void checkPhoneNumberFormat(String phoneNumber) throws IncorrectValueException{
        try {
            long check = Long.parseLong(phoneNumber); // ошибка приведения вида
        } catch (IncorrectValueException e){
            throw new IncorrectValueException("Формат телефона пользователя введен не правильно. " +
                    "Правильный формат ввода данных 111222334455");
        }
    }

   
    public static void checkGenderFormat(String gender) throws IncorrectValueException{
        if (gender.length() == 1){
            gender = gender.toLowerCase();
            if (gender.equals("m") || gender.equals("f")) {
                char[] charArray = gender.toCharArray();
                char convertedGender = charArray[0];
            } else {
                throw new IncorrectValueException("Вы непрвльно указали пол !\n" +
                        "Правильный формат ввода данных: m или f.");
            }
        } else {
            throw new IncorrectValueException("Вы неправильно указали пол!\n" +
                    "Пол указывается одним символом, если мужчина 'm', если женщина 'f'.\n" +
                    "Правильный формат ввода данных, если вы мужчина - 'm', если женщина - 'f'.");
        }
    }
}
