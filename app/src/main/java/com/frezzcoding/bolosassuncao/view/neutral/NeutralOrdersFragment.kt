import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.frezzcoding.bolosassuncao.R


class NeutralOrdersFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_orders, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        /*
        button_photos.setOnClickListener {
            val random = Random()

            val nextAction = CameraFragmentDirections.nextAction()
            nextAction.setNumOfPhotos(random.nextInt(100))

            Navigation.findNavController(it).navigate(nextAction)
        }

         */
    }
}