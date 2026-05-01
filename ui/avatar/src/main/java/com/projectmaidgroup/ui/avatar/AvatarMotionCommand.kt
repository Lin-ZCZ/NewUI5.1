package com.projectmaidgroup.ui.avatar

enum class AvatarEmotion {
    NEUTRAL,
    HAPPY,
    SAD,
    ANGRY,
    THINKING,
    SURPRISED,
    SHY,
    ERROR
}

data class Live2DMotionCommand(
    val emotion: AvatarEmotion = AvatarEmotion.NEUTRAL,

    /**
     * Live2D model3.json 里的 MotionGroup 名字。
     *
     * 你当前 Mao 模型里主要有：
     * Idle
     * TapBody
     */
    val group: String? = null,

    /**
     * 具体动作文件路径。
     *
     * 例如：
     * motions/mtn_02.motion3.json
     * motions/special_01.motion3.json
     */
    val motionFile: String? = null,

    /**
     * 动作优先级。
     *
     * 数字越大，越容易打断当前动作。
     * 普通回复动作建议 3。
     * 紧急动作，比如错误、惊讶，可以用 4。
     */
    val priority: Int = 3
)