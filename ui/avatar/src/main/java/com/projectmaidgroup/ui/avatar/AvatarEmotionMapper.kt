package com.projectmaidgroup.ui.avatar

object AvatarEmotionMapper {

    fun toMotionCommand(emotion: AvatarEmotion): Live2DMotionCommand {
        return when (emotion) {
            AvatarEmotion.NEUTRAL -> Live2DMotionCommand(
                emotion = emotion,
                group = "Idle",
                motionFile = "motions/sample_01.motion3.json",
                priority = 2
            )

            AvatarEmotion.HAPPY -> Live2DMotionCommand(
                emotion = emotion,
                group = "TapBody",
                motionFile = "motions/special_01.motion3.json",
                priority = 3
            )

            AvatarEmotion.SAD -> Live2DMotionCommand(
                emotion = emotion,
                group = "TapBody",
                motionFile = "motions/mtn_03.motion3.json",
                priority = 3
            )

            AvatarEmotion.ANGRY -> Live2DMotionCommand(
                emotion = emotion,
                group = "TapBody",
                motionFile = "motions/mtn_04.motion3.json",
                priority = 4
            )

            AvatarEmotion.THINKING -> Live2DMotionCommand(
                emotion = emotion,
                group = "TapBody",
                motionFile = "motions/mtn_02.motion3.json",
                priority = 3
            )

            AvatarEmotion.SURPRISED -> Live2DMotionCommand(
                emotion = emotion,
                group = "TapBody",
                motionFile = "motions/special_02.motion3.json",
                priority = 4
            )

            AvatarEmotion.SHY -> Live2DMotionCommand(
                emotion = emotion,
                group = "TapBody",
                motionFile = "motions/special_03.motion3.json",
                priority = 3
            )

            AvatarEmotion.ERROR -> Live2DMotionCommand(
                emotion = emotion,
                group = "TapBody",
                motionFile = "motions/mtn_04.motion3.json",
                priority = 4
            )
        }
    }
}