package com.kiyotakeshi.springkotlin

import com.kiyotakeshi.springkotlin.database.UserMapper
import com.kiyotakeshi.springkotlin.database.UserRecord
import com.kiyotakeshi.springkotlin.database.selectByPrimaryKey
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

// MapperObject の DI を解決できず警告が出るので回避策としてつける(なくてもよい)
@Suppress("SpringJavaInjectionPointsAutowiringInspection")
@RestController
@RequestMapping("/users")
class UserController(
    val userMapper: UserMapper
) {
    @GetMapping("/{id}")
    fun select(@PathVariable("id") id: Int): UserRecord? {
        return userMapper.selectByPrimaryKey(id)
    }
}