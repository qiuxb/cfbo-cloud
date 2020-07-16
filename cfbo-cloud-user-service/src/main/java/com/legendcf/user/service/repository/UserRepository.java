package com.legendcf.user.service.repository;

import com.legendcf.user.api.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * 用户
 *
 * @author qiuxb
 * @date 2020/7/8
 */
//@Repository
public interface UserRepository extends PagingAndSortingRepository<User, Long> {
}
