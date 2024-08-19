package com.example.sos_helper.fbService.fcmService

import android.app.Activity
import com.android.volley.Request
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import org.json.JSONObject

class SendNotificationWIthFCMService {
    val url = "https://fcm.googleapis.com/v1/projects/new-project-c4271/messages:send"
    val token =
        "Bearer ya29.a0AcM612yGlgLc6XPeQpx3S30qLiXWLn9GafUcjoyDKBacPYuwI1q6Je8e1xPGpUWSfBeLjPJTqKpxDfkQ223-_QBd3MXLm7dcRFnJpdMnnye_2y2xat_qPu8T9HBrwMIvzOcdjPalrkF3yxHFDDI3xsVN-GcBymCBlObAuluIaCgYKAWYSARMSFQHGX2MiK6eJse5WlrVxQkz_l-BRHQ0175"

    fun startService(activity: Activity, fcmTokens: List<String>) {
        for (i in fcmTokens.indices) {
            val requestBody = JSONObject().apply {
                put("message", JSONObject().apply {
                    put(
                        "token",
                        fcmTokens[i]
                    )
                    put("notification", JSONObject().apply {
                        put("body", "This is an FCM notification message!")
                        put("title", "FCM Message")
                    })
                })
            }

            val jsonObjectRequest = object : JsonObjectRequest(
                Request.Method.POST, url, requestBody,
                { response ->
                    // Handle the response
                    println("Response: $response")
                },
                { error ->
                    // Handle the error
                    println("Error: ${error.message}")
                }
            ) {
                override fun getHeaders(): MutableMap<String, String> {
                    val headers = HashMap<String, String>()
                    headers["Content-Type"] = "application/json"
                    headers["Authorization"] = token
                    return headers
                }
            }

            val requestQueue = Volley.newRequestQueue(activity)
            requestQueue.add(jsonObjectRequest)
        }
    }


}