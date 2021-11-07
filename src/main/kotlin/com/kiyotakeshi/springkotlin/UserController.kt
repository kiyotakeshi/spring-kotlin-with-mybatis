package com.kiyotakeshi.springkotlin

import com.kiyotakeshi.springkotlin.database.UserMapper
import com.kiyotakeshi.springkotlin.database.UserRecord
import com.kiyotakeshi.springkotlin.database.insert
import com.kiyotakeshi.springkotlin.database.selectByPrimaryKey
import org.springframework.web.bind.annotation.*

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

    // curl -H 'Content-Type:application/json' -X POST -d '{"id": 100, "name": "kanye", "age": 40, "profile": "donda"}' http://localhost:8080/users
    @PostMapping
    fun insert(@RequestBody request: UserRequest): UserResponse {
        val record = UserRecord(request.id, request.name, request.age, request.profile)
        return UserResponse(userMapper.insert(record))
    }
}