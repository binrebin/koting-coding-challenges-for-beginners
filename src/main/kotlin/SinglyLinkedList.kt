class SinglyLinkedList<E> : Iterable<Node<E>> {
    var head: Node<E>? = null

    fun getAt(index: Int): Node<E>? {
        if (head == null) {
            return null
        }
        var node = head
        var count = 0

        while (node != null) {
            if (count == index) {
                return node
            }
            count++
            node = node.next
        }
        return null
    }

    fun insertAt(data: E, index: Int) {
        if (index == 0) {
            head = Node(data, head)
        } else {
            val prevNode = getAt(index - 1) ?: last
            val node = prevNode?.next
            prevNode?.next = Node(data, node)
        }
    }

    val size: Int
        get() {
            var count = 0
            var node = head

            while (node != null) {
                count++
                node = node.next
            }

            return count
        }

    fun removeAt(index: Int) {
        if (index == 0) {
            head = head?.next
        } else {
            val prevNode = getAt(index - 1)
            val nextNode = prevNode?.next?.next
            prevNode?.next = nextNode
        }
    }

    val first: Node<E>?
        get() = getAt(0)
    val last: Node<E>?
        get() = getAt(size - 1)

    fun insertFirst(data: E) {
        insertAt(data, 0)
    }
    fun insertLast(data: E) {
        insertAt(data, size)
    }
    fun removeFirst() {
        removeAt(0)
    }
    fun removeLast() {
        removeAt(size - 1)
    }

    fun setAt(data: E, index: Int) {
        getAt(index)?.data = data
    }

    fun clear() {
        head = null
    }

    override fun toString() = head.toString()

    override fun iterator() = object : Iterator<Node<E>> {
        var node = head
        override fun hasNext() = node != null

        override fun next(): Node<E> {
            val currentNode = node
            node = node?.next
            return currentNode!!
        }
    }

    operator fun plus(linkedList: SinglyLinkedList<E>): SinglyLinkedList<E> {
        val result = SinglyLinkedList<E>()
        forEach { result.insertLast(it.data) } // drop original and create new list appending
        linkedList.forEach { result.insertLast(it.data) }
        return result
    }
}

data class Node<T>(
    var data: T,
    var next: Node<T>? = null
)

