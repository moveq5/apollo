package apollo.util

import com.sun.jna.Pointer
import com.sun.jna.Structure

class iovec : Structure() {
    @JvmField var iov_base: Pointer? = null
    @JvmField var iov_len: Int = 0

    override fun getFieldOrder(): List<String> {
        return createFieldsOrder("iov_base", "iov_len")
    }
}
