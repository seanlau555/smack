package com.example.jonnyb.smack.Services

import android.graphics.Color
import com.example.jonnyb.smack.Controller.App
import java.util.*

/**
 * Created by jonnyb on 9/4/17.
 */
object UserDataService {

    var id = ""
    var avatarColor = ""
    var avatarName = ""
    var email = ""
    var name = ""

    fun logout() {
        id = ""
        avatarColor = ""
        avatarName = ""
        email = ""
        name = ""
        App.prefs.authToken = ""
        App.prefs.userEmail = ""
        App.prefs.isLoggedIn = false
    }

    fun returnAvatarColor(components: String) : Int {
        val strippedColor = components
                .replace("[","")
                .replace("]","")
                .replace(",","")

        var r = 0
        var g = 0
        var b = 0

        val scanner = Scanner(strippedColor)
        if (scanner.hasNext()) {
            r = (scanner.nextDouble() * 255).toInt()
            g = (scanner.nextDouble() * 255).toInt()
            b = (scanner.nextDouble() * 255).toInt()
        }

        return Color.rgb(r,g,b)
    }

}















