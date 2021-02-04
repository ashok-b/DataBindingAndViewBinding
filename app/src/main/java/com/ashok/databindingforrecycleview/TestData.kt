package com.ashok.databindingforrecycleview

object TestData {
    fun dummyData(): ArrayList<PersonInfo> {
        var dataSet = mutableListOf<PersonInfo>()

        val p1 = PersonInfo("1. Alejandro Escamilla", "https://picsum.photos/id/1024/1920/1280")
        val p2 = PersonInfo("2. Paul Jarvis", "https://picsum.photos/id/238/200")
        val p3 = PersonInfo("3. Tina Rataj", "https://picsum.photos/id/239/200")
        val p4 = PersonInfo("4. Danielle MacInnes", "https://picsum.photos/id/1016/3844/2563")
        val p5 = PersonInfo("5. Ashok B", "https://picsum.photos/id/241/200")
        val p6 = PersonInfo("6. Christian Bardenhorst", "https://picsum.photos/id/0/5616/3744")
        val p7 = PersonInfo("7. Roberto Nickson", "https://picsum.photos/id/1025/4951/3301")
        val p8 = PersonInfo("8. Scott Webb", "https://picsum.photos/id/1009/5000/7502")
        val p9 = PersonInfo("9. Patrick Fore", "https://picsum.photos/id/1012/3973/2639")
        val p10 = PersonInfo("10. Frances Gunn", "https://picsum.photos/id/101/2621/1747")
        val p11 = PersonInfo("11. William Hook", "https://picsum.photos/id/100/2500/1656")
        dataSet.add(p1)
        dataSet.add(p2)
        dataSet.add(p3)
        dataSet.add(p4)
        dataSet.add(p5)
        dataSet.add(p6)
        dataSet.add(p7)
        dataSet.add(p8)
        dataSet.add(p9)
        dataSet.add(p10)
        dataSet.add(p11)
        return dataSet as ArrayList<PersonInfo>
    }
}
