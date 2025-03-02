package apollo.feature

import apollo.feature.impl.Feature

class FeatureManager(vararg features: Feature) {
    val features = features

    inline fun <reified T> get(): Feature {
        features.forEach({
            if (it is T) {
                return it
            }
        })

        throw Exception("feature does not exist")
    }
}
