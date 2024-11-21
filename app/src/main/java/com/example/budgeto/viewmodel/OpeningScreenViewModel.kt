package com.example.budgeto.viewmodel

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import java.util.Locale
import java.util.Stack

class OpeningScreenViewModel: ViewModel() {
    var operationText = mutableStateOf("")
        private set
    var resultText = mutableStateOf("")
        private set
    private var isResultDisplayed = false

    fun appendNumber(value: String) {
        try {
            if (isResultDisplayed) {
                operationText.value = value
                isResultDisplayed = false
            } else {
                operationText.value += value
            }
        }
        catch (ex:Exception)
        {
            Log.d("Append number", ex.message.toString())
        }

    }

    fun appendOperation(value: String) {
        try {
            if (isResultDisplayed) {
                operationText.value = resultText.value + value
                isResultDisplayed = false
            } else {
                operationText.value += value
            }
        } catch (ex:Exception)
        {
            Log.d("Append operation", ex.message.toString())
        }

    }

    fun deleteLast() {
        try{
            if (operationText.value.isNotEmpty()) {
                operationText.value = operationText.value.dropLast(1)
            }
        } catch (ex:Exception)
        {
            Log.d("Delete last", ex.message.toString())
        }

    }

    fun calculateResult() {
        try {
            if(operationText.value.isNullOrEmpty())
            {
                operationText.value = "0.00"
            }

            var rawResult = evaluateExpression(operationText.value)
            resultText.value = formatResult(rawResult)
            isResultDisplayed = true
        }
        catch (ex:Exception)
        {
            Log.d("Calculate result", ex.message.toString())
        }
    }

    private fun formatResult(result: String): String {
        return try {
            String.format(Locale.US, "%.2f", result.toDouble())
        } catch (e: NumberFormatException) {
            "Error"
        }
    }

    private fun evaluateExpression(expression: String): String {
        return try {
            val result = ExpressionParser().evaluate(expression)
            result.toString()
        } catch (e: Exception) {
            "Error"
        }
    }
}

class ExpressionParser {
    fun evaluate(expression: String): Double {
        val tokens = expression.toCharArray()
        val values = Stack<Double>()
        val ops = Stack<Char>()

        try {
            var i = 0
            while (i < tokens.size) {
                when {
                    tokens[i] == ' ' -> i++
                    tokens[i] in '0'..'9' || tokens[i] == '.' -> {
                        val sb = StringBuilder()
                        while (i < tokens.size && (tokens[i] in '0'..'9' || tokens[i] == '.')) {
                            sb.append(tokens[i++])
                        }
                        values.push(sb.toString().toDouble())
                    }
                    tokens[i] == '(' -> ops.push(tokens[i++])
                    tokens[i] == ')' -> {
                        while (ops.peek() != '(') {
                            values.push(applyOp(ops.pop(), values.pop(), values.pop()))
                        }
                        ops.pop()
                        i++
                    }
                    tokens[i] in listOf('+', '-', '*', '/') -> {
                        while (ops.isNotEmpty() && hasPrecedence(tokens[i], ops.peek())) {
                            values.push(applyOp(ops.pop(), values.pop(), values.pop()))
                        }
                        ops.push(tokens[i++])
                    }
                    else -> i++
                }
            }

            while (ops.isNotEmpty()) {
                values.push(applyOp(ops.pop(), values.pop(), values.pop()))
            }
        }catch (ex:Exception)
        {
            Log.d("Evaluate expression", ex.message.toString())
        }

        return values.pop()
    }

    private fun hasPrecedence(op1: Char, op2: Char): Boolean {
        if (op2 == '(' || op2 == ')') return false
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-')) return false
        return true
    }

    private fun applyOp(op: Char, b: Double, a: Double): Double {
        return when (op) {
            '+' -> a + b
            '-' -> a - b
            '*' -> a * b
            '/' -> {
                if (b == 0.0) throw UnsupportedOperationException("Cannot divide by zero")
                a / b
            }
            else -> 0.0
        }
    }
}