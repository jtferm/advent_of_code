require 'box_id'

RSpec.describe BoxID do
  context "boolean flags" do
    describe "pairs" do
      it "returns false for ids without letter pairs" do
        box_id = BoxID.new('abcdef')
        expect(box_id.pair?).to eq(false)
      end

      it "returns true for ids with a letter pair and triple" do
        box_id = BoxID.new('bababc')
        expect(box_id.pair?).to eq(true)
      end

      it "returns true for ids with a letter pair" do
        box_id = BoxID.new('abbcde')
        expect(box_id.pair?).to eq(true)
      end

      it "returns false for ids with a letter triple but no letter pairs" do
        box_id = BoxID.new('abcccd')
        expect(box_id.pair?).to eq(false)
      end

      it "returns true for ids with multiple letter pairs" do
        box_id = BoxID.new('aabcdd')
        expect(box_id.pair?).to eq(true)
      end

      it "returns false for ids with multiple letter triples but no letter pairs" do
        box_id = BoxID.new('ababab')
        expect(box_id.pair?).to eq(false)
      end
    end

    describe "triples" do
      it "returns false for ids without letter triples" do
        box_id = BoxID.new('abcdef')
        expect(box_id.triple?).to eq(false)
      end

      it "returns true for ids with a letter pair and triple" do
        box_id = BoxID.new('bababc')
        expect(box_id.triple?).to eq(true)
      end

      it "returns false for ids with a letter pair but no letter triples" do
        box_id = BoxID.new('abbcde')
        expect(box_id.triple?).to eq(false)
      end

      it "returns true for ids with a letter triple but no letter pairs" do
        box_id = BoxID.new('abcccd')
        expect(box_id.triple?).to eq(true)
      end

      it "returns false for ids with multiple letter pairs" do
        box_id = BoxID.new('aabcdd')
        expect(box_id.triple?).to eq(false)
      end

      it "returns true for ids with multiple letter triples but no letter pairs" do
        box_id = BoxID.new('ababab')
        expect(box_id.triple?).to eq(true)
      end
    end
  end
end
