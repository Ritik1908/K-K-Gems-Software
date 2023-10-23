package com.kkgems.backend.controller

import com.kkgems.backend.model.Vendor
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class VendorController {

    @GetMapping("/vendors")
    fun get() =
            Vendor("1", "LM")

}