package com.peterservice.psc.framework.generated

import com.peterservice.psc.framework.spec.HasBisTemplate
import com.peterservice.psc.framework.spec.HasSidTemplate
import com.peterservice.psc.framework.spec.bisTemplate
import com.peterservice.psc.framework.spec.type.meta.ArgMetaInfo
import com.peterservice.psc.framework.spec.type.meta.ArgValidators
import com.peterservice.psc.framework.spec.type.meta.ArgMetaDictionaryValidator
import com.peterservice.psc.framework.spec.type.meta.GroupMetaInfo
import com.peterservice.psc.framework.spec.type.meta.TplMetaInfo
import com.peterservice.psc.framework.spec.type.VariantSpecType
import com.peterservice.psc.framework.spec.type.variant_spec_type
import com.peterservice.vv.sid.product_offering
import com.peterservice.psc.framework.terminology.generated.plaSpec
import com.peterservice.psc.framework.terminology.generated.unit_of_measure

@TplMetaInfo(
    title = "Включайся Общайся ДЕМО МФ 27.07.2018",
    description = "null",
    primary = true
)

class VODemoCaseMFv1 : HasBisTemplate, HasSidTemplate {

    @GroupMetaInfo(title = "Regional", desc = "null", onlyForIT = false)
    var regional = Regional()

    @GroupMetaInfo(title = "Non regional", desc = "null", onlyForIT = false)
    var non_regional = Non_regional()

    class Regional {

        @ArgMetaInfo(title = "Parameter title", description = " some description", regional = true, onlyForIT = false, validator = ArgValidators.POSITIVE)
        var Parameter_title = 1

        @ArgMetaInfo(title = "InternetAllowance", description = " some description", regional = true, onlyForIT = false)
        var InternetAllowance = variant_spec_type(plaSpec.allowance_applicability, 15.0, unit_of_measure.ГБ) {
            priceEvent = null
        }

    }

    class Non_regional {

        @ArgMetaInfo(title = "Parameter title", description = " some description", regional = false, onlyForIT = false, validator = ArgValidators.POSITIVE)
        var Parameter_title1 = 1

    }


    override fun createSidTemplate() = product_offering {
    }

    override fun createBisTemplate() = bisTemplate {
    }
}