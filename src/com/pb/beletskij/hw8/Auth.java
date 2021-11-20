package com.pb.beletskij.hw8;

public class Auth {
    private String login;
    private String password;

    public void signUp(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {

        if(login==null || password==null|| confirmPassword==null){
            throw new WrongLoginException("Логин не корректный");
        }

        if((login.length()>5&&login.length()<20)){
            if(login.matches("^[a-zA-Z0-9]+$") ){
                if(password.length()>5){
                    if(password.matches("^[a-zA-Z0-9_]+$")){
                        if(password.equals(confirmPassword)){
                            this.login=login;
                            this.password=password;
                        }else{
                            throw  new WrongPasswordException("Пароль не корректный");
                        }
                    }else{
                        throw  new WrongPasswordException("Пароль не корректный");
                    }
                }else{
                    throw  new WrongPasswordException("Пароль не корректный");
                }
            }else{
                throw  new WrongLoginException("Пароль не совпадает");
            }
        }else{
            throw  new WrongLoginException("Логин не корректный");
        }
    }


    public Boolean signIn(String login, String password) throws WrongLoginException {

        if(login==null || password==null){
            throw new WrongLoginException("Логин не корректный");
        }
        if (login.equals(this.login) && password.equals(this.password)) {
            return true;
        } else {
            throw new WrongLoginException("Логин не корректный");
        }
    }




    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

