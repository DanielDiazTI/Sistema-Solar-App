package com.example.sistemasolar.Adapters

import com.example.sistemasolar.R

object SetData {
    fun setMenus(): List<MenuData>  {
        var menuList = mutableListOf<MenuData>()
        menuList.add(
            MenuData(
                "Sol",
                "El Sol, por ser la estrella más cercana a la Tierra...",
                "Distancia: 150.000.000 km",
                "El Sol es la estrella más próxima a la Tierra y se encuentra a una distancia promedio de 150 millones de kilómetros. Es la principal fuente primaria de luz y calor para la Tierra.",
                "Estrella",
                R.drawable.ic_sol_detalles,
                R.drawable.ic_sol
            )
        )
        menuList.add(
            MenuData(
                "Mercurio",
                "Mercurio es el planeta del Sistema Solar próximo al sol...",
                "Distancia: 57.910.000 km",
                "Metal venenoso de color blanco plateado que es líquido a temperaturas ordinarias. Se usa generalmente en termómetros y amalgamas, y se ha usado como ingrediente en algunos medicamentos homeopáticos y, en cantidades muy pequeñas, como conservador en las vacunas víricas.",
                "Planeta",
                R.drawable.ic_mercurio_detalles,
                R.drawable.ic_mercurio
            )
        )
        menuList.add(
            MenuData(
                "Venus",
                "Venus es el planeta del Sistema Solar en orden de distancia desde el sol...",
                "Distancia: 108.200.000 km",
                "Es un planeta terrestre: es pequeño y rocoso. Su atmósfera es densa: atrapa el calor y por eso es tan caluroso. Tiene una superficie activa, que incluye volcanes. Gira en dirección contraria a la Tierra y la mayoría de los planetas.",
                "Planeta",
                R.drawable.ic_venus_detalles,
                R.drawable.ic_venus
            )
        )
        menuList.add(
            MenuData(
                "Tierra",
                "La Tierra es el más denso y el quinto mayor de los 8 planetas...  ",
                "Distancia: 146.600.000 km",
                "Nuestro hogar, el planeta Tierra, es un planeta terrestre y rocoso. Tiene una superficie sólida y activa, con montañas, valles, cañones, llanuras y mucho más. La Tierra es especial porque es un planeta océano, ya que el agua cubre el 70% de su superficie. Nuestra atmósferaestá compuesta, en gran parte, por nitrógeno.",
                "Planeta",
                R.drawable.ic_tierra_detalles,
                R.drawable.ic_tierra
            )
        )
        menuList.add(
            MenuData(
                "Luna",
                "La Luna es el sátelite natural de la Tierra...",
                "Distancia: 384.400 km",
                "La Luna es el único satélite natural de la Tierra. Se encuentra a 384 400 km de distancia de la Tierra y tiene un diámetro de 3476 km. Tarda en dar una vuelta alrededor de la Tierra unos 27.32 días.",
                "Satélite Natural",
                R.drawable.ic_luna_detalle,
                R.drawable.ic_luna
            )
        )
        menuList.add(
            MenuData(
                "Marte",
                "Marte es el cuarto planeta del Sistemas Solar más cercano al sol...",
                "Distancia: 227.940.000 km",
                "Marte es el cuarto planeta en orden de distancia al Sol y el segundo más pequeño del sistema solar, después de Mercurio. Recibió su nombre en homenaje al dios de la guerra de la mitología romana (Ares en la mitología griega), y también es conocido como el planeta rojo debido a la apariencia rojiza que le confiere el óxido de hierro predominante en su superficie. Marte es el planeta interior más alejado del Sol.",
                "Planeta",
                R.drawable.ic_marte_detalles,
                R.drawable.ic_marte
            )
        )
        menuList.add(
            MenuData(
                "Jupiter",
                "Jupiter es el quito planeta del Sistema Solar...",
                " 588 000 000 km",
                "Júpiter es el planeta más grande de nuestro sistema solar. Es parecido a una estrella, pero nunca llegó a ser lo suficientemente masiva como para empezar a arder. Está cubierto de rayas de nubes arremolinadas. Tiene fuertes tormentas como la Gran Mancha Roja, que hace cientos de años que dura. Júpiter es un gigante hecho de gas, y no tiene una superficie sólida, pero puede tener un núcleo interno sólido de aproximadamente el tamaño de la Tierra. Júpiter también tiene anillos, pero son demasiado tenues para verlos muy bien.",
                "Planeta",
                R.drawable.ic_jupiter_detalles,
                R.drawable.ic_jupiter
            )
        )
        menuList.add(
            MenuData(
                "Saturno",
                "Saturno es el sexto planeta del Sistema Solar...",
                "Distancia: 1.426.400.000 km",
                "Es un gigante de gas, como Júpiter. Está compuesto por hidrógeno y helio, sobre todo. Tiene una atmósfera densa. Cuenta con un precioso grupo de siete anillos separados por espacio entre ellos.",
                "Planeta",
                R.drawable.ic_saturno_detalles,
                R.drawable.ic_saturno
            )
        )
        menuList.add(
            MenuData(
                "Urano",
                "Urano es el séptimo planeta del Sistema Solar...",
                "Distancia: 2.870.990.000",
                "Es un gigante de gas, como Júpiter. Está compuesto por hidrógeno y helio, sobre todo. Tiene una atmósfera densa. Cuenta con un precioso grupo de siete anillos separados por espacio entre ellos.",
                "Planeta",
                R.drawable.ic_urano_detalles,
                R.drawable.ic_urano
            )
        )
        menuList.add(
            MenuData(
                "Neptuno",
                "Neptuno es el octavo planeta en respecto al sol y el más lejano...",
                "Distancia: 4.504.300.000 km",
                "Es el último de los planetas de nuestro sistema solar. Está más de 30 veces más lejos del Sol que la Tierra. Neptuno es muy parecido a Urano. Está compuesto de una espesa mezcla de agua, amoniaco y metano sobre un centro sólido del tamaño de la Tierra.",
                "Planeta",
                R.drawable.ic_neptuno_detalles,
                R.drawable.ic_neptuno
            )
        )
        menuList.add(
            MenuData(
                "Pluton",
                "Pluton, en 2006 pasó de ser un planeta a...",
                "Distancia: 5.913.520.000 km",
                "Plutón es un planeta enano que se encuentra en el cinturón de Kuiper. Es un área llena de objetos helados y otros planetas enanos en el borde de nuestro sistema solar. Debido a que Plutón es el objeto más grande conocido en esta región, algunos lo llaman Rey del Cinturón de Kuiper. Una cosa es segura.",
                "Planeta Enano",
                R.drawable.ic_pluton_detalles,
                R.drawable.ic_pluton
            )
        )
        return menuList
    }
}