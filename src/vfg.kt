    fun main()
    {
     println("Введите номер функции")
        val funct = readLine()!!.toInt()
        when (funct) {
            1 -> {
                println("Введите номер алгебраического задания")
                val zada = readLine()!!.toInt()
                when (zada) {
                    1 -> {
                        println("Площадь квадрата")
                        println("Введите значение")
                        val plk = readLine()!!.toInt()
                        val plkotv = plk * plk
                        print("Ответ: ")
                        println(plkotv)
                    }
                    2 -> {
                        println("Площадь прямоугольника")
                        println("Введите 1-е числовое значение длинны стороны")
                        val plp1 = readLine()!!.toInt()
                        println("Введите 2-е числовое значение длинны стороны")
                        val plp2 = readLine()!!.toInt()
                        val plpotv = plp1 * plp2
                        println("Ответ: ")
                        println(plpotv)
                    }
                    3 -> {println("Длинна окружности")
                        println("Значение для длинны окружности")
                        val dlokr = readLine()!!.toInt()
                        val dlokrotv = 2 * 3.14 * dlokr
                        println("Длинна окружности: ")
                        println(dlokrotv)
                    }
                    4 -> {
                        println("Площадь круга")
                        println("Значение для площади круга")
                        val plkr = readLine()!!.toInt()
                        val plkrotv = 3.14 * plkr * plkr
                        print("Ответ: ")
                        println(plkrotv)
                    }
                    5 -> {println("Квадрат суммы")
                        println("Введите числовое значение 1-ого квадрата")
                        val cvs1 = readLine()!!.toInt()
                        println("Введите числовое значение 2-ого квадрата")
                        val cvs2 = readLine()!!.toInt()
                        val cvsotv = cvs1 * cvs1 + 2 * cvs1 * cvs2 + cvs2 * cvs2
                        print("Ответ: ")
                        println(cvsotv)
                    }
                    6 -> {println("Квадрат разности")
                        println("Введите числовое значение 1-ого квадрата")
                        val cvr1 = readLine()!!.toInt()
                        println("Введите числовое значение 2-ого квадрата")
                        val cvr2 = readLine()!!.toInt()
                        val cvrotv = cvr1 * cvr1 - 2 * cvr1 * cvr2 + cvr2 * cvr2
                        print("Ответ: ")
                        println(cvrotv)
                    }
                }


            }
            2 -> {
                println("Введите номер физического задания")
                val zada2 = readLine()!!.toInt()
                when (zada2) {
                    1 -> {println("Расчёт силы")
                        println("Введите значение массы")
                        val rasS = readLine()!!.toInt()
                        println("Вы ввели $rasS килограмм")
                        val rasSotv = rasS * 9.8
                        println("Сила равна $rasSotv Ньютонам ")
                    }
                    2 -> {println("Расчёт давления")
                        println("Введите значение силы")
                        val rasP1 = readLine()!!.toInt()
                        println("Введите значение площади")
                        val rasP2 = readLine()!!.toInt()
                        val rasPotv = rasP1 / rasP2
                        println("Давление равно $rasPotv Паскалям")
                    }
                }
            }
            3 -> {
                println("Больше или меньше")
                val zada3 = readLine()!!.toInt()
                when (zada3) {
                    1 -> {println("Больше или меньше")
                        val bim = readLine()!!.toInt()
                        val isPositive = 14 < bim
                        println(isPositive)
                }
                    2 -> {println("Какое число больше")
                        val kchbim1 = readLine()!!.toInt()
                        val kchbim2 = readLine()!!.toInt()
                        val isPositive2 = kchbim1 > kchbim2
                        println(isPositive2)
                    }
                    3 -> {println("Какое число больше2")
                        val kchb21 = readLine()!!.toInt()
                        val kchb22 = readLine()!!.toInt()
                        val isPositive3 = kchb21 > 5 * kchb22
                        println(isPositive3)
                    }
                }
            }
        }
    }

