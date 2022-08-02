package org.speex.dsp;

public class SpeexDspNative {

    static {
        System.loadLibrary("speexdsp");
    }

    public static native void preprocessStateInit(int frame_size, int sampleRate,int denoise,
                                                  int dB, int agc,int agc_level);
    public static native void preprocessStateDestroy();
    /**
     * 
     * @param audio pcm data
     * @return Bool value for voice activity (1 for speech, 0 for noise/silence), ONLY if VAD turned on.
     */
    public static native int preprocessRun(short[] audio);




    public static native void echoStateInit(int frame_size, int filter_length,int sampleRate);
    public static native void echoStateDestroy();
    public static native void echoCancellation(short[] inputFrame, short[] echoFrame, short[] outputFrame);

}
