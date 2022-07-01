package com.voxeldev.summerpractice2022.data.models

class SnackRepository {

    fun getSnacks(): List<Snack> {
        // здесь можно было бы отправить запрос в сеть...

        return listOf(
            Snack(
                0,
                "Snickers",
                "Батончик Snickers",
                "50 руб.",
                "https://www.snickers.com/sites/g/files/fnmzdf616/files/migrate-product-files/dryeqrv2efldaaoyceat.png"
            ),
            Snack(
                1,
                "KitKat",
                "Батончик KitKat",
                "46 руб.",
                "https://main-cdn.sbermegamarket.ru/big2/hlr-system/-1/22/35/76/16/25/19/100024250617b0.jpeg"
            ),
            Snack(
                2,
                "Lay's с крабом",
                "Стандартная упаковка Lay's со вкусом краба",
                "90 руб.",
                "https://main-cdn.sbermegamarket.ru/big2/hlr-system/-37/710/743/411/281/757/100029896634b0.jpg"
            ),
            Snack(
                3,
                "Twix \"Солёная карамель\"",
                "Батончик Twix (Солёная карамель)",
                "42 руб.",
                "https://main-cdn.sbermegamarket.ru/big2/hlr-system/-13/639/433/671/111/144/100027552218b0.jpg"
            ),
            Snack(
                2,
                "Чипсы Doritos сырные",
                "Стандартная упаковка Doritos со вкусом сыра",
                "120 руб.",
                "https://main-cdn.sbermegamarket.ru/big2/hlr-system/32/76/42/25/51/13/0/100027524422b0.jpg"
            ),
            Snack(
                2,
                "Шоколад Ritter Sports лесной орех",
                "Шоколадная плитка, сделано в Германии",
                "130 руб.",
                "https://main-cdn.sbermegamarket.ru/big2/hlr-system/1663694/100023331866b0.jpg"
            )
        )
    }
}