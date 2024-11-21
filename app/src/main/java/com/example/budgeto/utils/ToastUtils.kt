package com.example.budgeto.utils

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.view.Gravity
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.example.budgeto.R

object ToastUtil {

    private const val DEFAULT_TOP_OFFSET = 50
    private const val DEFAULT_BOTTOM_OFFSET = 50

    /**
     * Show a toast at the top of the screen.
     */
    fun showToastAtTop(
        context: Context,
        message: String,
        iconResId: Int = R.mipmap.ic_launcher, // Default app icon
        yOffset: Int = DEFAULT_TOP_OFFSET,
        width: Int = ViewGroup.LayoutParams.WRAP_CONTENT,
        height: Int = ViewGroup.LayoutParams.WRAP_CONTENT,
        backgroundOpacity: Float = 0.8f, // Default opacity (80%)
        textAlignment: Int = Gravity.CENTER // Default text alignment (left-aligned)
    ) {
        showCustomToast(
            context = context,
            message = message,
            iconResId = iconResId,
            position = Gravity.TOP or Gravity.CENTER_HORIZONTAL,
            yOffset = yOffset,
            width = width,
            height = height,
            backgroundOpacity = backgroundOpacity,
            textAlignment = textAlignment
        )
    }

    /**
     * Show a toast at the bottom of the screen.
     */
    fun showToastAtBottom(
        context: Context,
        message: String,
        iconResId: Int = R.mipmap.ic_launcher, // Default app icon
        yOffset: Int = DEFAULT_BOTTOM_OFFSET,
        width: Int = ViewGroup.LayoutParams.WRAP_CONTENT,
        height: Int = ViewGroup.LayoutParams.WRAP_CONTENT,
        backgroundOpacity: Float = 0.8f, // Default opacity (80%)
        textAlignment: Int = Gravity.START // Default text alignment (left-aligned)
    ) {
        showCustomToast(
            context = context,
            message = message,
            iconResId = iconResId,
            position = Gravity.BOTTOM or Gravity.CENTER_HORIZONTAL,
            yOffset = yOffset,
            width = width,
            height = height,
            backgroundOpacity = backgroundOpacity,
            textAlignment = textAlignment
        )
    }

    /**
     * Show a customizable toast with dynamic size, position, opacity, and text alignment.
     */
    private fun showCustomToast(
        context: Context,
        message: String,
        iconResId: Int?,
        position: Int,
        xOffset: Int = 0,
        yOffset: Int = 0,
        width: Int = ViewGroup.LayoutParams.WRAP_CONTENT,
        height: Int = ViewGroup.LayoutParams.WRAP_CONTENT,
        backgroundOpacity: Float = 0.8f, // Opacity as a float (0.0f to 1.0f)
        textAlignment: Int = Gravity.CENTER // Default text alignment
    ) {
        val inflater = LayoutInflater.from(context)
        val layout = inflater.inflate(R.layout.custom_toast, null)

        // Set the message in the custom layout
        val textView: TextView = layout.findViewById(R.id.toastText)
        textView.text = message
        textView.gravity = textAlignment // Set text alignment dynamically

        // Set the icon if provided
        val imageView: ImageView = layout.findViewById(R.id.toastIcon)
        if (iconResId != null) {
            imageView.setImageResource(iconResId)
            imageView.visibility = ImageView.VISIBLE
        } else {
            imageView.visibility = ImageView.GONE
        }

        // Adjust the background opacity
        val background = layout.background as GradientDrawable
        val baseColor = ContextCompat.getColor(context, R.color.black) // Replace with your color
        val alpha = (backgroundOpacity * 255).toInt() // Convert float opacity to alpha (0–255)
        background.setColor(Color.argb(alpha, Color.red(baseColor), Color.green(baseColor), Color.blue(baseColor)))

        // Adjust the size dynamically
        layout.layoutParams = ViewGroup.LayoutParams(width, height)

        // Create and show the toast
        val toast = Toast(context)
        toast.duration = Toast.LENGTH_SHORT
        toast.view = layout
        toast.setGravity(position, xOffset, yOffset)
        toast.show()
    }
}
