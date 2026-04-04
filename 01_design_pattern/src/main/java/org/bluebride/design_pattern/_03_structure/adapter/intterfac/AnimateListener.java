package org.bluebride.design_pattern._03_structure.adapter.intterfac;

public interface AnimateListener {
    void onAnimateStart();
    void onAnimatePause();
    void onAnimateRepeat();
    void onAnimateEnd();
}
