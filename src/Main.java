public class Main
{
    public static void check   (String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException{

        try {
            if (login.length() > 20) {
                throw new WrongLoginException();
            }
            if (password.length()>20){
                throw new WrongPasswordException();
            }
            if (!password.equals(confirmPassword)){
                System.out.println("Пароли не совпадают");
            }
            if (!password.matches("^[a-zA-Z0-9_]*$")) {
                System.out.println("Пароль должен состоять только из латинских букв, цифр и знака подчеркивания");
            }
            if (!login.matches("^[a-zA-Z0-9_]*$")) {
                System.out.println("Логин должен состоять только из латинских букв, цифр и знака подчеркивания");
            }
        }
        catch (WrongLoginException e){
            System.out.println("Логин слишком длинный");
        }
        catch (WrongPasswordException e2){
            System.out.println("Пароль слишком длинный");
        }
        finally {
            System.out.println("Проверка закончена");
        }
    }

    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        String login = "java_skypro.go";
        String password = "D_1hWiKjjP_9";
        String confirmPassword = "D_1hWiKjjP_9";

        check (login, password,confirmPassword);
    }
}