package service;

import api.UserService;
import entity.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by Lendemark on 06.03.2019.
 */
public class UserServiceImpl implements UserService {

    List<User> users;

     public UserServiceImpl(){
         this.users = new ArrayList<User>();
     }

     public UserServiceImpl (List<User> users) {
         this.users = users;
     }

    public List<User> getAllUsers() {
        return users;
    }

    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void removeUserById(Long userId) {
         for(int i = 0; i<users.size(); i++){
             User userFromList = users.get(i);
             // wyciaganie usera przypisujemy kolejno iterujacego usera
             // z fora do zmiennej
             if(userFromList.getId() == userId){
                 users.remove(i);
                 break;
                 // jeśli id usera ziterowanego jest takie same jakie przyszło w zadaniu usun tego usera
                 // po usunieciu przerywamy petle bo zadanie wykonane
             }

         }
    }
}
