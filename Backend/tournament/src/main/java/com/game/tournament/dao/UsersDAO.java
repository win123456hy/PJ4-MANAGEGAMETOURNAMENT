package com.game.tournament.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.game.tournament.model.Users;

@Repository
public class UsersDAO {
	private static final Map<Integer, Users> userMap = new HashMap<Integer, Users>();
	 
    static {
    	initUsers();
    }
 
    private static void initUsers() {
    	Users user1 = new Users(1, "SKT T1", 1);
    	Users user2 = new Users(2, "FPX", 2);
    	Users user3 = new Users(3, "G2", 1);
    	Users user4 = new Users(4, "GAM", 2);
    	
 
    	userMap.put(user1.getId(), user1);
    	userMap.put(user2.getId(), user2);
    	userMap.put(user3.getId(), user3);
    	userMap.put(user4.getId(), user4);
    }
 
    public Users getUser(int id) {
        return userMap.get(id);
    }
 
    public Users addUser(Users user) {
    	userMap.put(user.getId(), user);
        return user;
    }
 
    public Users updateUser(Users user) {
    	userMap.put(user.getId(), user);
        return user;
    }
 
    public void deleteUser(int id) {
    	userMap.remove(id);
    }
 
    public List<Users> getAllUsers() {
        Collection<Users> c = userMap.values();
        List<Users> list = new ArrayList<Users>();
        list.addAll(c);
        return list;
    }
}
