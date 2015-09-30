package br.inf.audasi.api.service;

import br.inf.audasi.domain.entity.User;
import br.inf.audasi.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

/**
 * @author renatomoitinhodias@gmail.com
 */
@Repository
@Cacheable(value="userService")
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User findByLogin(String login) {
        return userRepository.findByLogin(login).get();
    }

}
